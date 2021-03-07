import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class TestReader {
    public static String path = "../数据-1/dataset/aps_order.csv";
    public static void main(String[] args){
        List<BeanOrder> allOrders = new ArrayList();
        try{
            BufferedReader br = newABufferReader(path);
            int ptrOfLine=0;
            while (true) {
                ptrOfLine++;
                String line = br.readLine();
                if(line==null || "".equals(line)) break;
                System.out.println(line);
                if(ptrOfLine==1){
                    continue;
                    //this is a row with title, ignore it.
                }
                processALine(line,allOrders);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        for(BeanOrder Order:allOrders){
            System.out.println(Order.toString());
        }



    }
    /**
     * Return BufferedReader br.
     * @param file_path
     * @return BufferedReader br
     * @throws Exception
     */
    public static BufferedReader newABufferReader(String file_path) throws Exception{
        BufferedReader result = null;
        String pathname = file_path;
        File filename = new File(pathname);
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream(filename));
        result = new BufferedReader(reader);
        return result;
    }
    public static OrderProduct processALine(String line,List<BeanOrder> allOrders){
        OrderProduct result = null;
        String[] tokens = line.split(",");
        for(int i=0;i<tokens.length;i++){
            String token = tokens[i];
            tokens[i] = token.replaceAll("\"","");
        }
        /*
        for(String token:tokens){
            System.out.println(token);
        }*/
        String OrderId = tokens[0];
        String Description = tokens[1];
        String ProductID = tokens[2];
        String ProductAmount = tokens[3];
        String EarliestStartTime = tokens[4];
        String LatestEndTime = tokens[5];
        OrderProduct Product = new OrderProduct();
        Product.setProductAmount(Integer.parseInt(ProductAmount))
              /*  .setEarliestStartTime(Date.valueOf(EarliestStartTime))
                .setLatestEndTime(Date.valueOf(LatestEndTime))*/
                .setOrderID(OrderId);
        boolean Found = false;
        for(BeanOrder Order:allOrders){
            //find order with same ID
            if(Order.getOrderID().equals(Product.getOrderID())){
                Order.getAllProducts().add(Product);
                Found=true;
            }
        }
        // not find
        if(!Found){
            BeanOrder AnOrder = new BeanOrder().setOrderID(OrderId);
            AnOrder.getAllProducts().add(Product);
            allOrders.add(AnOrder);
        }


        return result;
    }
}
