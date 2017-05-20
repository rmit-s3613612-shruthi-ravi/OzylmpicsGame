/**
* @author: Shruthi s3613612

*/
package ozlympicsgame;
import java.util.Random;
class Person 
{
    String id,name,state,typegame;

    public String getTypegame() {
        return typegame;
    }

    public void setTypegame(String typegame) {
        this.typegame = typegame;
    }
    int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    int finishtime,points;

    public int getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(int finishtime) {
        this.finishtime = finishtime;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
	Person(String id, String name, int age, String state,String typegame,int finishtime,int points)
	{	
            this.typegame=typegame;
            this.finishtime=finishtime;
            this.points=points;
		this.id = id;
		this.name = name;
                this.age = age;
		this.state = state;	
	}
}
