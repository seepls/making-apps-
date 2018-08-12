// 1.activity is implemented as a subclass of Activity class:
public class MyActivity extends Activity {
}
//2. service is implemented as a subclass of Service
public class MyService extends Service {
}

//3.A broadcast receiver is implemented as a subclass of BroadcastReceiver class 
//and each message is broadcaster as an Intent object.
public class MyReceiver  extends  BroadcastReceiver {
   public void onReceive(context,intent){}
}

//4. content provider is implemented as a subclass of ContentProvider class
//and must implement a standard set of APIs that enable other applications to perform transactions.
public class MyContentProvider extends  ContentProvider {
   public void onCreate(){}
}
