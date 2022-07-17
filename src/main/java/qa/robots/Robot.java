package qa.robots;

import qa.energy.Energy;

/**
 * Robot - абстрактный класс, объединяющий всех роботов
 * Здесь использован принцип ООП - абстракция
 * (способ объединить набор общих характеристик объектов,
 * исключая из рассмотрения частные и незначительные)
 */
public abstract class Robot {

    /**
     * метод зарядки роботов в зависимости от вида энергии
     *
     * @param energy - вид энергии
     * @param index  - показатель для заправки
     */

    public void refuel(Energy energy, int index) {
        switch (energy) {
            case ATOMIC -> atomicRefuel(index);
            case ELECTRIC -> electricRefuel(index);
            case INTERNAL_COMBUSTION -> refueling(index);
        }
    }


    /**
     * метод заправки электрической энергией
     * ориентируется на степень заряженности батареи
     *
     * @param charge - процент заряженности батареи
     */

    void electricRefuel(int charge) {
        if (charge <= 20) {
            System.out.println("Робот заряжается автоматически");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("Робот заряжается принудительно");
            try {
                Thread.sleep((100 - charge) * 100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Робот полностью заряжен");
    }


    /**
     * заправка атомной энергией
     * заправляет робота раз в 50 лет
     *
     * @param lastRefuelingYear - сколько лет назад была последняя заправка
     */

    private void atomicRefuel(int lastRefuelingYear) {
        if (lastRefuelingYear >= 50) {
            System.out.println("Робот заправлен");
        } else
            System.out.println("Робот в заправке не нуждается, последняя заправка была "
                    + lastRefuelingYear
                    + " лет назад");
    }

    /**
     * заправка топливом
     * заправляет по мере опустошения бака
     *
     * @param tankFullness - наполненность бака
     */
    private void refueling(int tankFullness) {
        if (tankFullness < 10) {
            System.out.println("Робот заправлен топливом");
        }
    }


    /**
     * робот умеет ходить
     */
    public void walk() {
        System.out.println("Robot walking");
    }

    

    /**
     * робот умеет ездить
     */
    public void drive() {
        System.out.println("Robot driving");
    }

    /**
     * робот умеет летать
     */
    public void fly() {
        System.out.println("Robot flies");
    }


}
