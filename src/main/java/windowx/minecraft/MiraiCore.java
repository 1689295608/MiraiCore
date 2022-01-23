package windowx.minecraft;

import org.bukkit.plugin.java.JavaPlugin;

public class MiraiCore extends JavaPlugin {
    public static void main(String[] args) {
        System.out.println("This is main function for MiraiCore");
    }

    @Override
    public void onEnable() {
        this.getLogger().info("Enabling MiraiCore...");
    }
}
