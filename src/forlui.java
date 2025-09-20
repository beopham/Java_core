public class forlui {
    public static void main(String[] args) {
        int sumchan=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2 ==0)
            {
                sumchan=sumchan+i;
            }
        }
        System.out.println("tổng số chẵn từ 1 đến 10 ");
        System.out.println(sumchan);
        int sumle=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2 !=0)
            {
                sumle=sumle+i;
            }
        }
        System.out.println("tổng số lẻ từ 1 đến 10 ");
        System.out.println(sumle);
    }

}
