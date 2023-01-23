package simbitsoft.eshevtsova.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class PositronicaTests {

    private PositronicaMainPage page = new PositronicaMainPage();

    static Stream<Arguments> testWithMethodSource() {
        return Stream.of(
                Arguments.of(
                        8, "Канцтовары"),
                Arguments.of(
                        9, "Сетевое оборудование и серверы")
        );
    }

    @ValueSource(strings = {"Садовая техника и инструменты", "Офисная техника и мебель"})
    @ParameterizedTest()
    void openWithValueSource(String tabName) {
        page.openMainPage()
                .choseTab(tabName)
                .checkTabName(tabName);
    }

    @CsvSource({
            "Ноутбуки и компьютеры",
            "Комплектующие для ПК",
            "Смартфоны и гаджеты "
    })
    @ParameterizedTest()
    void openWithCSVSource(String tabName) {
        page.openMainPage()
                .choseTab(tabName)
                .checkTabName(tabName);
    }

    @EnumSource(value = PositronicaMenuItem.class)
    @ParameterizedTest()
    void openWithEnumSource(PositronicaMenuItem menuItem) {
        page.openMainPage()
                .choseTab(menuItem.getDescription())
                .checkTabName(menuItem.getDescription());
    }

    @MethodSource("testWithMethodSource")
    @ParameterizedTest()
    void openWithMethodSource(int number, String title) {
        page.openMainPage()
                .clickItemWithNumber(number)
                .checkTabName(title);
    }
}
