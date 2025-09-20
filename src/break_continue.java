public class break_continue {
    public static void main(String[] args) {
        System.out.println("break");
        for(int i=1;i<=10;i++){
               if(i==5)
               {
                   System.out.println("bỏ qua đk ny mà làm tiếp ");
                   continue;
               }
            System.out.println(i);
        }
        System.out.println("continue");
        for(int i=1;i<=10;i++){
            if(i==5)
            {
                System.out.println("thoát vòng lạp");
                break;
            }
            System.out.println(i);
        }
    }
}
