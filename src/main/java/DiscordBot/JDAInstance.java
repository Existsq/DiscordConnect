package DiscordBot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class JDAInstance {
    public static void main(String[] args) {
        
        try {
            JDA jda = JDABuilder.createDefault(Constants.TOKEN).build();
        } catch (Exception ignored) {
        }

    }

}
