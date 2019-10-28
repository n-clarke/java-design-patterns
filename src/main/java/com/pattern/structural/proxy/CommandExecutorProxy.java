package com.pattern.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String username, String password){
        if("Admin".equals(username) && "PASS123".equals(password)) isAdmin=true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin){
            executor.runCommand(cmd);
        }else{
            if(cmd.trim().startsWith("rm")){
                throw new Exception("rm command is disabled for non-admin users.");
            }else{
                executor.runCommand(cmd);
            }
        }
    }
}
