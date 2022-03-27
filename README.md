Инструкция по использованию заглушки.

Общие действия для двух развитий событий.
1. Скачать папку с файлами и открыть ее в качестве проекта в Intellij IDEA.
2. Запустить проект (либо запустить jar-file через командную строку в директории проекта командой: mvn spring-boot:run).

ДЕЙСТВУЕМ В БРАУЗЕРАХ:

3. В любой удобном браузере (лучше использовать Chrome или Firefox) в поисковую строку ввести http://localhost:8080/ok.
С вероятностью 99% страница откроется с ошибкой 405, потому что страница открывается с пустым методом, я думаю, что так окей.
5. Нажимаем F12, либо Ctrl+Shift+I.
6. Переходим на вкладку Console/Консоль.
7. В Chrome вводим: fetch('/ok',{method:'POST', headers: {'Content-Type':'application/json'}, body: JSON.stringify({"user_id": 1, "first_text": "Здесь первый текст для отправки", "second_text": "Здесь второй текст для отправки", "third_text": "Здесь третий текст для отправки"})}).then(console.log)
   В Mozilla Firefox, если используется первый раз может потребоваться ввести перед запросом: "разрешить вставку", то есть команда при первом вводе будет иметь вид:
8. разрешить вставку fetch('/ok',{method:'POST', headers: {'Content-Type':'application/json'}, body: JSON.stringify({"user_id": 1, "first_text": "Здесь первый текст для отправки", "second_text": "Здесь второй текст для отправки", "third_text": "Здесь третий текст для отправки"})}).then(console.log)
9. Нажать Enter.
10. Получить в ответ от сервера наш запрос.

ДЕЙСТВУЕМ В POSTMAN:


3. File -> New -> HTTP Request.
4. Перед надписью "Enter request URL" выбрать метод POST, вместо надписи ввести http://localhost:8080/ok.
5. Под URL перейти на вкладку Headers
6. В ячейку в столбце "KEY" ввести Content-Type
   В ячейку в столбце "VALUE" ввести application/json
7. Под URL перейти на вкладку Body
8. Поставить галочку(check) на row и ввести
  {

  "user_id": 1,

  "first_text": "Здесь первый текст для отправки",

  "second_text": "Здесь второй текст для отправки",

  "third_text": "Здесь третий текст для отправки"

  }

9. Нажать на синюю кнопку Send
10. В Response в Body получен ответ, который полностью соответсвует нашему запросу.
