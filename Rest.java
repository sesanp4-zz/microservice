/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import EchoPackage.EchoRequest;
import FlexiTransactionDetailPackage.FlexiTransactionDetail_Request;
import Flexi_RechargePackage.Flexi_Recharge_Request;
import ResellerBalancePackage.ResellerBalanceRequest;
import ResellerBalancePackage.ResellerBalanceResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * REST Web Service
 *
 * @author centricgateway
 */
@Path("api")
public class Rest {

    @Context
    private UriInfo context;
    
    Gson gson = new Gson();
    JsonObject obj;
    CloseableHttpClient client = HttpClients.createDefault();
    HttpPost post;
    HttpGet get;
    CloseableHttpResponse response;
    StringEntity ent;
    String message;

    /**
     * Creates a new instance of Rest
     */
    public Rest() {
    }

    /**
     * Retrieves representation of an instance of pack.Rest
     * @return an instance of java.lang.String
     */
         @Path("ECHO")
         @POST
         @Consumes(MediaType.TEXT_XML)
         @Produces(MediaType.TEXT_XML)
         public String checkEcho(String req) throws IOException{     
             ent = new StringEntity(req);
             ent.setChunked(true);
             post = new HttpPost("http://arizonaadmin.mobifinng.com/WebService/iTopUp/reseller_itopup.server.php?wsdl");
             post.setHeader("Content-Type", "text/xml");
             //post.addHeader("SOAPAction", "EchoCheck");
             post.setEntity(ent);
             response = client.execute(post);             
             String msg = EntityUtils.toString(response.getEntity());
             return msg;
         
         }
         
         
         
         
         @Path("reseller/balance")
         @POST
         @Consumes(MediaType.TEXT_XML)
         @Produces(MediaType.TEXT_XML)
         public String ResellerBalance(String req) throws IOException{            
             ent = new StringEntity(req);
             ent.setChunked(true);
             post = new HttpPost("http://arizonaadmin.mobifinng.com/WebService/iTopUp/reseller_itopup.server.php?wsdl");
             post.setHeader("Content-Type", "text/xml");
             //post.addHeader("SOAPAction", "ResellerBalance");
             post.setEntity(ent);
             response = client.execute(post);            
             String msg = EntityUtils.toString(response.getEntity());
             return msg;
         
         }  
         
         
         @Path("trans/details")
         @POST
         @Consumes(MediaType.TEXT_XML)
         @Produces(MediaType.TEXT_XML)
         public String TranDetails(String req) throws IOException{             
             ent = new StringEntity(req);
             ent.setChunked(true);
             post = new HttpPost("http://arizonaadmin.mobifinng.com/WebService/iTopUp/reseller_itopup.server.php?wsdl");
             post.setHeader("Content-Type", "text/xml");
             //post.addHeader("SOAPAction", "ResellerBalance");
             post.setEntity(ent);
             response = client.execute(post);
             String msg = EntityUtils.toString(response.getEntity());
             return msg;
         
         }  
         
    
         @Path("flexi/recharge")
         @POST
         @Consumes(MediaType.TEXT_XML)
         @Produces(MediaType.TEXT_XML)
         public String Flexi_Recharge(String req) throws IOException{           
             ent = new StringEntity(req);
             ent.setChunked(true);
             post = new HttpPost("http://arizonaadmin.mobifinng.com/WebService/iTopUp/reseller_itopup.server.php?wsdl");
             post.setHeader("Content-Type", "text/xml");
             //post.addHeader("SOAPAction", "ResellerBalance");
             post.setEntity(ent);
             response = client.execute(post);
             String msg = EntityUtils.toString(response.getEntity());
             System.out.println(msg);
             return msg;
         
         } 
         
         
         
         @Path("fix/recharge")
         @POST
         @Consumes(MediaType.TEXT_XML)
         @Produces(MediaType.TEXT_XML)
         public String FixRecharge(String req) throws IOException{           
             ent = new StringEntity(req);
             ent.setChunked(true);
             post = new HttpPost("http://arizonaadmin.mobifinng.com/WebService/iTopUp/reseller_itopup.server.php?wsdl");
             post.setHeader("Content-Type", "text/xml");
             //post.addHeader("SOAPAction", "ResellerBalance");
             post.setEntity(ent);
             response = client.execute(post);
             String msg = EntityUtils.toString(response.getEntity());
             System.out.println(msg);
             return msg;
         
         } 
         
         
               
            
         
         
         @Path("flexi/reversal")
         @POST
         @Consumes(MediaType.TEXT_XML)
         @Produces(MediaType.TEXT_XML)
         public String Flexi_Reversal(String req) throws IOException{
             ent = new StringEntity(req);
             ent.setChunked(true);
             post = new HttpPost("http://arizonaadmin.mobifinng.com/WebService/iTopUp/reseller_itopup.server.php?wsdl");
             post.setHeader("Content-Type", "text/xml");
             //post.addHeader("SOAPAction", "ResellerBalance");
             post.setEntity(ent);
             response = client.execute(post);
             String msg = EntityUtils.toString(response.getEntity());
             System.out.println(msg);
             return msg;
         
         }
         
    
}
