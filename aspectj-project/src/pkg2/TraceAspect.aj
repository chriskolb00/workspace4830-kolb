package pkg2;

public aspect TraceAspect {
   pointcut classToTrace(): within(Circle);
   pointcut methodToTrace():  classToTrace() &&  execution(double area(double));

   before(): methodToTrace() {
      String info = thisJoinPointStaticPart.getSignature() + ", " //
            + thisJoinPointStaticPart.getSourceLocation().getFileName() + ", " //
            + thisJoinPointStaticPart.getSourceLocation().getLine();
      System.out.println("\t-->" + info);
   }

   after(): methodToTrace() {
      System.out.println("\t<--" + thisJoinPointStaticPart.getSignature());
   }
}
