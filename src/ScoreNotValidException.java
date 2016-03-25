/**
 * Created by Carol on 3/25/16.
 */
public class ScoreNotValidException extends RuntimeException
{
   public ScoreNotValidException()
   {

   }
   public ScoreNotValidException(String message)
   {
      super(message);
   }
   public ScoreNotValidException(Throwable cause)
   {
      super(cause);
   }
   public ScoreNotValidException(String message, Throwable cause)
   {
      super(message,cause);
   }
}
