public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }

   /**
    * find the max value in the array
    * @param objects
    * @return the max value
    */
   public static Measurable max(Measurable[] objects)
   {
      double max = objects[0].getMeasure();
      Measurable temp = objects[0];
      for (int i = 1; i<objects.length;i++)
      {
         if (objects[i].getMeasure() > max)
         {
            max = objects[i].getMeasure();
            temp = objects[i];
         }
      }
      return temp;
   }
}




