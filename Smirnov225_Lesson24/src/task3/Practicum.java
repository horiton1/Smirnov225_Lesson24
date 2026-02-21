package task3;

class Practicum {
    static void main() {
        Watch watch = new Watch();

        // настройка часов
        watch.changeTimeZone();  // Переключаем на Asia/Vladivostok
        watch.changeTimeZone();  // Переключаем на Europe/Moscow
        watch.addTenHours();      // +10 часов = 10:00
        watch.addHour();          // +1 час = 11:00
        watch.addTenMinutes();    // +10 минут = 11:10
        watch.addTenMinutes();    // +10 минут = 11:20
        watch.addMinute();        // +1 минута = 11:21
        watch.addMinute();        // +1 минута = 11:22
        watch.addMinute();        // +1 минута = 11:23
        watch.addMinute();        // +1 минута = 11:24
        watch.addMinute();        // +1 минута = 11:25
        watch.addMinute();        // +1 минута = 11:26

        System.out.println(watch.getCurrentTime());
    }
}