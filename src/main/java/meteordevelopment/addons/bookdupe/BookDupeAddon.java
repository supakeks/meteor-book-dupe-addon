package meteordevelopment.addons.bookdupe;

import minegame159.meteorclient.MeteorAddon;
import minegame159.meteorclient.MeteorClient;
import minegame159.meteorclient.commands.Commands;

public class BookDupeAddon extends MeteorAddon {

	@Override
	public void onInitialize() {
		MeteorClient.LOG.info("Initializing Book Dupe Addon");
		Commands.get().add(new BookDupeCommand());
	}

}