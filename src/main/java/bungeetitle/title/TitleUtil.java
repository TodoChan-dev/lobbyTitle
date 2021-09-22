package bungeetitle.title;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.Title;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class TitleUtil implements Listener {


    public static void onAction(ProxiedPlayer player, TextComponent main, TextComponent sub, Integer... optionalTitleArgs) {
        Title title = ProxyServer.getInstance().createTitle();
        if (optionalTitleArgs != null && optionalTitleArgs.length >= 3) {
            if (optionalTitleArgs[0] != 0 || optionalTitleArgs[1] != 0 || optionalTitleArgs[2] != 0) {
                title.fadeIn(optionalTitleArgs[0]*20);
                title.stay(optionalTitleArgs[1]*20);
                title.fadeOut(optionalTitleArgs[2]*20);
            }
        }
        title.title(main);
        title.subTitle(sub);
        title.send(player);
    }
    @EventHandler
    public void onPlayerLogin(PostLoginEvent event){
        ProxiedPlayer player = event.getPlayer();
        ChatUtil cu = new ChatUtil();
        TitleUtil.onAction(player, new TextComponent(cu.format(ChatColor.DARK_GREEN + "T" + ChatColor.WHITE + "-Project")), new TextComponent(cu.format("&7へようこそ")), 1, 4, 1);
    }
}
