package Seminar_2;
/*1.Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
*/
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class DZ_1 {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("select * from students where ");
    String filter = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";
// убираем все лишние символы
    String filer2 = filter.replace("\"", "")
            .replace("{","")
            .replace("}", "")
            .replace(" ", "");


    String[] stringArray = filer2.split(",");

        for (int i = 0; i < stringArray.length; i++) {
        if (!stringArray[i].contains("null")) {             // если не содержит подстроку null
            sb.append(stringArray[i].split(":")[0])
                    .append(" = ").append('\'')
                    .append(stringArray[i].split(":")[1])
                    .append('\'').append(" and ");
        }
    }
        sb.replace(sb.length()-5,sb.length(),"");
        System.out.println(sb);
    // Итог "select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'"

}}