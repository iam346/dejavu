package hu.unideb.inf.dejavu.gui;

import hu.unideb.inf.dejavu.DejaVu;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MainMenu extends DVMenu {
	DVButton game = new DVButton("Játék", 0);
	DVButton settings = new DVButton("Beállítások", 0);
	DVButton highScore = new DVButton("Eredménytábla", 0);
	DVButton back = new DVButton("Vissza", 1);

	MainMenu() {
		super();

		SlidePane rightPane = new SlidePane(500, settings, highScore);
		setRight(rightPane);

		back.setOnAction((arg0) -> {
			DejaVuGUI.setNewMenu(new WelcomeMenu());
		});

		game.setOnAction((arg) -> {
			if (!DejaVuGUI.dimensionChoser.getSelectionModel().isEmpty()) {
				DejaVu.game.setDim(DejaVuGUI.dimensionChoser.getValue());
			}

			if (DejaVu.game.isSetDim() || DejaVu.game.filesExist()) {
				DejaVu.game.setCards(DejaVuGUI.cardPathList);

				DejaVuGUI.setNewMenu(new PlayGround());
			}

		});
		setHgap(10);
		setVgap(10);
		add(new DVText("DejaVu", Font.font("Verdana", FontWeight.BOLD, 30)), 1, 2);

		add(game, 1, 17);
		add(settings, 1, 19);
		add(highScore, 1, 21);
		add(back, 1, 40);

	}
}
