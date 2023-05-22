/*    */ package dev.mrauro.nospawn;
/*    */ 
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class Toggle implements CommandExecutor {
/*    */   public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
/* 11 */     Nospawn.enabled = !Nospawn.enabled;
/* 12 */     System.out.println("Nospawn is now " + (Nospawn.enabled ? "enabled" : "disabled"));
/*    */     
/* 14 */     if (sender instanceof Player) { Player player = (Player)sender;
/* 15 */       player.sendMessage("Nospawn is now " + (Nospawn.enabled ? "enabled" : "disabled")); }
/*    */ 
/*    */     
/* 18 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\NUC Backup\Minecraft\test\nospawn-1.0-SNAPSHOT.jar!\dev\mrauro\nospawn\Toggle.class
 * Java compiler version: 16 (60.0)
 * JD-Core Version:       1.1.3
 */