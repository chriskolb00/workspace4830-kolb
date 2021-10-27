
public aspect TraceAspectKolb {
	pointcut classToTrace(): within(ComponentApp) || within(DataApp) || within(ServiceApp);
	pointcut methodToTrace(): classToTrace() && execution(String getName());
	
	before(): methodToTrace(){
		String info=thisJoinPointStaticPart.getSignature()
			+ ", kind: "+ 
			thisJoinPointStaticPart.getSourceLocation().getLine();
		System.out.println("[BGN] "+info);
	}
	after(): methodToTrace(){
		System.out.println("[END] "+thisJoinPointStaticPart.getSourceLocation().getFileName());
	}
}
