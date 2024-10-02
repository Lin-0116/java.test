package mode;

public class Text {


    public static void main(String[] args) {
        movie[]mo=new movie[5];
        //number为电影主演姓名，请生成不同的电影信息
        mo[0]=new movie(1,"《流浪地球》",30,"刘德华");
        mo[1]=new movie(2,"《战狼3》",35,"吴京");
        mo[2]=new movie(3,"《749局》",25,"王俊凯");
        mo[3]=new movie(4,"《抓娃娃》",20,"沈腾");
        mo[4]=new movie(5,"《狼少年》",31,"宋仲基");

        movieoperate m=new movieoperate();
        m.show(mo);
        m.search(mo);

    }
}
