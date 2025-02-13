/**
 * Класс BattleArena (Основной класс с методом main)
 *
 * ОПИСАНИЕ НА РУССКОМ:
 * 1) В методе main() создаём объект Player и объект Enemy.
 * 2) Организуем логику пошаговой (или цикличной) битвы между игроком и врагом.
 * 3) Можно использовать Scanner для ввода действий игрока:
 *    - Выбор между действиями: атаковать, лечиться, бежать и т.д.
 * 4) Закончить цикл, когда игрок или враг мертвы (health <= 0).
 * 5) Вывести результат битвы.
 */
public class BattleArena {
    public static void main(String[] args) {
        // TODO:
        // Примерные шаги:
        // 1) Спросить у пользователя имя игрока (через Scanner).
        // 2) Создать объект Player (new Player(...)).
        // 3) Создать объект Enemy (new Enemy(...)).
        // 4) Организовать цикл битвы (while player.isAlive() && enemy.isAlive()).
        //    - Спросить у пользователя, что делать:
        //      (1) Атаковать врага, (2) Восстановить здоровье (optional), (3) Сбежать (optional) и т.д.
        //    - Выполнить соответствующие методы (attack, takeDamage).
        //    - Проверить, жив ли игрок/враг, вывести статусы.
        // 5) По окончании цикла вывести победителя или причину завершения игры.
    }
}
