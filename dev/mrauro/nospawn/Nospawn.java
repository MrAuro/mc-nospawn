/*    */ package dev.mrauro.nospawn;
/*    */ 
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntitySpawnEvent;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public final class Nospawn extends JavaPlugin implements Listener {
/*    */   public static boolean enabled = true;
/*    */   
/*    */   public void onEnable() {
/* 13 */     getServer().getPluginManager().registerEvents(this, (Plugin)this);
/* 14 */     getCommand("toggle").setExecutor(new Toggle());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onDisable() {}
/*    */ 
/*    */ 
/*    */   
/*    */   @EventHandler
/*    */   public void onEntitySpawnEvent(EntitySpawnEvent event) {
/* 25 */     if (event.getEntity() instanceof org.bukkit.entity.Monster && enabled && 
/* 26 */       event.getLocation().getBlockX() >= 199 && event.getLocation().getBlockX() <= 401 && 
/* 27 */       event.getLocation().getBlockY() >= 30 && event.getLocation().getBlockY() <= 105 && 
/* 28 */       event.getLocation().getBlockZ() >= 201 && event.getLocation().getBlockZ() <= 363)
/* 29 */       event.setCancelled(true); 
/*    */   }
/*    */ }


/* Location:              D:\NUC Backup\Minecraft\test\nospawn-1.0-SNAPSHOT.jar!\dev\mrauro\nospawn\Nospawn.class
 * Java compiler version: 16 (60.0)
 * JD-Core Version:       1.1.3
 */