package online.starsmc.spawn.module;

import me.fixeddev.commandflow.annotated.CommandClass;
import online.starsmc.spawn.command.MainCommand;
import online.starsmc.spawn.command.SetSpawnCommand;
import online.starsmc.spawn.command.SpawnCommand;
import team.unnamed.inject.AbstractModule;

public class CommandModule extends AbstractModule {

        @Override
        protected void configure() {
            multibind(CommandClass.class)
                    .asSet()
                    .to(MainCommand.class)
                    .to(SetSpawnCommand.class)
                    .to(SpawnCommand.class);
        }
}
