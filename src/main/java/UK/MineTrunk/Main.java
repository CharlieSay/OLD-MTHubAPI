/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UK.MineTrunk;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
    
    public static Main MainClass;
    
    @Override
    public void onEnable(){
        MainClass = this;
    }
    
}
