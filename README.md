## Java Builder

- Vytovřte základní builder pro Coordinates s atributy $longtitude$ a $latitude$. N8sledn2 vztvo5te novou instanci Coordinates s pou6it9m nov2 implementovaného Builderu.
- Vytvořte třídu Player.
- Tato třída bude obsahovat atributy name, age, spritePath, hp, mana a xp.
Instance třídy se bude vytvářet v tomto formátu:
Player player = new Player.PlayerBuilder().setName("Steve").setMana(200).build();

- Upravte Builder tak aby artibuty name a mana byly poviné a instance nešla vytvořit bez zadání těchto hodnot.

