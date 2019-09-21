package crud;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonEncodeDemo {
	public static void main(String[] args) {
		JsonEncodeDemo obj = new JsonEncodeDemo();
		String[] msg = new String[20];
		msg[0] = "j3j3j3";
		
		obj.encode_json(1, "cris", 300, 10, msg);
	}
   
   public JSONObject encode_json(int idPedido, String name, int monto, int descuento, String message[]) {
	  JSONObject obj = new JSONObject();
	  
	  try {
		  obj.put("idPedido", new Integer(idPedido));
		  obj.put("name", name);
	      obj.put("monto", new Integer(monto));
	      obj.put("descuento", new Integer(descuento));
	      obj.put("message", message);
	  } catch(JSONException e) {
		  System.out.println(e);
	  }
	  
	   
      System.out.print(obj);
	      
	  return obj;
   }
	
}
