package bungeetitle.title;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;

public class ChatUtil {
    public BaseComponent[] format(String s) {
        return TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&' , s));
    }
}
