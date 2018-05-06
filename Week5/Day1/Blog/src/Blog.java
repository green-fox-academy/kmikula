import java.util.ArrayList;

public class Blog {

    ArrayList<BlogPost>posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void add(BlogPost blogPost){
        posts.add(blogPost);
    }

    public void delete(int index){
        posts.remove(index);
    }

    public void update(int index, BlogPost blogPost){
        posts.set(index, blogPost);
    }

    public void print(int index){
        System.out.println(posts.get(index).text);
    }
}
