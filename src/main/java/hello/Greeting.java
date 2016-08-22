package hello;

/**
 * Created by jaf on 16/8/22.
 * 为了对问候语的描述进行建模,创建了一个资源描述类。
 * 提供了一个包含域(id,content),构造方法和访问器(getter setter)
 * 的 pojo 类
 */
public class Greeting {

    private final long id;
    private final String content;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

}
