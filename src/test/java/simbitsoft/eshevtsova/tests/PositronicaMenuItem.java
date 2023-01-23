package simbitsoft.eshevtsova.tests;

public enum PositronicaMenuItem {

    KITCHEN("Техника для кухни"),
    HOME("Техника для дома"),
    TV("Телевизоры, аудио, видео");

    private String description;

    PositronicaMenuItem(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }
}
