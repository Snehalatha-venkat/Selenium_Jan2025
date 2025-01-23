package week3.day2;

public class APIClient {
	
	public void sendRequest (String endpoint) {
		System.out.println("The EndPoint is:"+ endpoint);
	 }
	
	public void sendRequest (String endpoint,String requestBody, boolean requestStatus) {
	  System.out.println("The Endpoint URL is:"+ endpoint);
	  System.out.println("The Request Body is:"+ requestBody);
	  System.out.println("The Request Status is:" + requestStatus);
		
	}
	public static void main(String[] args) {
		APIClient apiReq = new APIClient();
		apiReq.sendRequest("https://api.example.com/users/123/order");
		apiReq.sendRequest("https://api.example.com/users/123/order", "users", false);
	}

}

