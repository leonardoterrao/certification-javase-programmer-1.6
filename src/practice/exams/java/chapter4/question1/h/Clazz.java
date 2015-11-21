package practice.exams.java.chapter4.question1.h;

public class Clazz {

	public static void main(String[] args) {
		new Clazz();
	}
	
	public Clazz() {
		DefaultStaticInner defaultSI = new DefaultStaticInner();
		defaultSI.privateValue = "oi";
		defaultSI.protectedValue = "oi";
		defaultSI.defaultValue = "oi";
		defaultSI.publicValue = "oi";
		DefaultStaticInner.defaultStaticValue.length();
		DefaultStaticInner.publicStaticValue.length();
		DefaultStaticInner.DEFAULT_CONST.length();
		DefaultStaticInner.PUBLIC_CONST.length();
		defaultSI.privateMethod();
		defaultSI.protectedMethod();
		defaultSI.defaultMethod();
		defaultSI.publicMethod();
		
		PrivateStaticInner privateSI = new PrivateStaticInner();
		privateSI.privateValue = "oi";
		privateSI.protectedValue = "oi";
		privateSI.defaultValue = "oi";
		privateSI.publicValue = "oi";
		PrivateStaticInner.defaultStaticValue.length();
		PrivateStaticInner.publicStaticValue.length();
		PrivateStaticInner.DEFAULT_CONST.length();
		PrivateStaticInner.PUBLIC_CONST.length();
		privateSI.privateMethod();
		privateSI.protectedMethod();
		privateSI.defaultMethod();
		privateSI.publicMethod();
		
		ProtectedStaticInner protectedSI = new ProtectedStaticInner();
		protectedSI.privateValue = "oi";
		protectedSI.protectedValue = "oi";
		protectedSI.defaultValue = "oi";
		protectedSI.publicValue = "oi";
		ProtectedStaticInner.defaultStaticValue.length();
		ProtectedStaticInner.publicStaticValue.length();
		ProtectedStaticInner.DEFAULT_CONST.length();
		ProtectedStaticInner.PUBLIC_CONST.length();
		protectedSI.privateMethod();
		protectedSI.protectedMethod();
		protectedSI.defaultMethod();
		protectedSI.publicMethod();
		
		PublicStaticInner publicSI = new PublicStaticInner();
		publicSI.privateValue = "oi";
		publicSI.protectedValue = "oi";
		publicSI.defaultValue = "oi";
		publicSI.publicValue = "oi";
		PublicStaticInner.defaultStaticValue.length();
		PublicStaticInner.publicStaticValue.length();
		PublicStaticInner.DEFAULT_CONST.length();
		PublicStaticInner.PUBLIC_CONST.length();
		publicSI.privateMethod();
		publicSI.protectedMethod();
		publicSI.defaultMethod();
		publicSI.publicMethod();
		
		DefaultInner defaultI = new DefaultInner();
		defaultI.privateValue = "oi";
		defaultI.protectedValue = "oi";
		defaultI.defaultValue = "oi";
		defaultI.publicValue = "oi";
		DefaultInner.DEFAULT_CONST.length();
		DefaultInner.PUBLIC_CONST.length();		
		defaultI.privateMethod();
		defaultI.protectedMethod();
		defaultI.defaultMethod();
		defaultI.publicMethod();
		
		PrivateInner privateI = new PrivateInner();
		privateI.privateValue = "oi";
		privateI.protectedValue = "oi";
		privateI.defaultValue = "oi";
		privateI.publicValue = "oi";
		PrivateInner.DEFAULT_CONST.length();
		PrivateInner.PUBLIC_CONST.length();		
		privateI.privateMethod();
		privateI.protectedMethod();
		privateI.defaultMethod();
		privateI.publicMethod();
		
		ProtectedInner protectedI = new ProtectedInner();
		protectedI.privateValue = "oi";
		protectedI.protectedValue = "oi";
		protectedI.defaultValue = "oi";
		protectedI.publicValue = "oi";
		PublicInner.DEFAULT_CONST.length();
		PublicInner.PUBLIC_CONST.length();		
		protectedI.privateMethod();
		protectedI.protectedMethod();
		protectedI.defaultMethod();
		protectedI.publicMethod();
		
		PublicInner publicI = new PublicInner();
		publicI.privateValue = "oi";
		publicI.protectedValue = "oi";
		publicI.defaultValue = "oi";
		publicI.publicValue = "oi";
		PublicInner.DEFAULT_CONST.length();
		PublicInner.PUBLIC_CONST.length();		
		publicI.privateMethod();
		publicI.protectedMethod();
		publicI.defaultMethod();
		publicI.publicMethod();
		
	}
	
	static class DefaultStaticInner {
		static String defaultStaticValue = "defaultStaticValue";
		public static String publicStaticValue = "publicStaticValue";
		static final String DEFAULT_CONST = "PUBLIC_CONST";
		public static final String PUBLIC_CONST = "PUBLIC_CONST";
		
		private String privateValue;
		protected String protectedValue;
		String defaultValue;
		public String publicValue;
	
		private void privateMethod() {
		}
		
		protected void protectedMethod() {
		}
		
		void defaultMethod() {
		}
		
		public void publicMethod() {
		}
	}
	
	public static class PublicStaticInner {
		static String defaultStaticValue = "defaultStaticValue";
		public static String publicStaticValue = "publicStaticValue";
		static final String DEFAULT_CONST = "PUBLIC_CONST";
		public static final String PUBLIC_CONST = "PUBLIC_CONST";
		
		private String privateValue;
		protected String protectedValue;
		String defaultValue;
		public String publicValue;
		
		private void privateMethod() {
		}
		
		protected void protectedMethod() {
		}
		
		void defaultMethod() {
		}
		
		public void publicMethod() {
		}
	}
	
	protected static class ProtectedStaticInner {
		static String defaultStaticValue = "defaultStaticValue";
		public static String publicStaticValue = "publicStaticValue";
		static final String DEFAULT_CONST = "PUBLIC_CONST";
		public static final String PUBLIC_CONST = "PUBLIC_CONST";
		
		private String privateValue;
		protected String protectedValue;
		String defaultValue;
		public String publicValue;
		
		private void privateMethod() {
		}
		
		protected void protectedMethod() {
		}
		
		void defaultMethod() {
		}
		
		public void publicMethod() {
		}
	}
	
	private static class PrivateStaticInner {
		static String defaultStaticValue = "defaultStaticValue";
		public static String publicStaticValue = "publicStaticValue";
		static final String DEFAULT_CONST = "PUBLIC_CONST";
		public static final String PUBLIC_CONST = "PUBLIC_CONST";
		
		private String privateValue;
		protected String protectedValue;
		String defaultValue;
		public String publicValue;
		
		private void privateMethod() {
		}
		
		protected void protectedMethod() {
		}
		
		void defaultMethod() {
		}
		
		public void publicMethod() {
		}
	}
	
	class DefaultInner {
		static final String DEFAULT_CONST = "PUBLIC_CONST";
		public static final String PUBLIC_CONST = "PUBLIC_CONST";
		
		private String privateValue;
		protected String protectedValue;
		String defaultValue;
		public String publicValue;

		private void privateMethod() {
		}
		
		protected void protectedMethod() {
		}
		
		void defaultMethod() {
		}
		
		public void publicMethod() {
		}
	}
	
	public class PublicInner {
		static final String DEFAULT_CONST = "PUBLIC_CONST";
		public static final String PUBLIC_CONST = "PUBLIC_CONST";
		
		private String privateValue;
		protected String protectedValue;
		String defaultValue;
		public String publicValue;
		
		private void privateMethod() {
		}
		
		protected void protectedMethod() {
		}
		
		void defaultMethod() {
		}
		
		public void publicMethod() {
		}
	}
	
	protected class ProtectedInner {
		static final String DEFAULT_CONST = "PUBLIC_CONST";
		public static final String PUBLIC_CONST = "PUBLIC_CONST";
		
		private String privateValue;
		protected String protectedValue;
		String defaultValue;
		public String publicValue;
		
		private void privateMethod() {
		}
		
		protected void protectedMethod() {
		}
		
		void defaultMethod() {
		}
		
		public void publicMethod() {
		}
	}
	
	private class PrivateInner {
		static final String DEFAULT_CONST = "PUBLIC_CONST";
		public static final String PUBLIC_CONST = "PUBLIC_CONST";
		
		private String privateValue;
		protected String protectedValue;
		String defaultValue;
		public String publicValue;
		
		private void privateMethod() {
		}
		
		protected void protectedMethod() {
		}
		
		void defaultMethod() {
		}
		
		public void publicMethod() {
		}
	}
	
}
