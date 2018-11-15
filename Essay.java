 public class Essay extends GradedActivity
      {
         private double grammar;
         private double spelling;
         private double length;
         private double content;
         private double score;
      
      
         public void setScore(double g, double s, double l, double c)
            {
               this.grammar = g;
               this.spelling = s;
               this.length = l;
               this.content = c;
               super.setScore(g+s+l+c);
            }
            
         public double getGrammar()
            {
               return grammar;
            }
            
         public double getSpelling()
            {
               return spelling;
            }
            
         public double getCorrectLength()
            {
               return length;
            }
            
         public double getContent()
            {
               return content;
            }
       
      }