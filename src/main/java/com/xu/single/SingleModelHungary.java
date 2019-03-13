package com.xu.single;

/**
 * ����ģʽ
 * д���򵥣�����װ�ص�ʱ��������ʵ���� �������߳�ͬ��������
 * ȱ�㣺�����ʼ����û��ʹ������� ������ڴ���˷�
 * @author xurw
 *
 */
public class SingleModelHungary {
	//ʹ�þ�̬�����ķ�ʽ
	private static final SingleModelHungary SINGLE_MODEL_HUNGARY = new SingleModelHungary();
	
	private SingleModelHungary() {}
	
	
	public static SingleModelHungary getInstance1(){
		return SINGLE_MODEL_HUNGARY;
	}
	
	//ʹ�þ�̬�����
	private static SingleModelHungary SINGLE_MODEL ;
	
	static {
		SINGLE_MODEL  = new SingleModelHungary();
	}
	
	public static SingleModelHungary getInstance2(){
		return SINGLE_MODEL_HUNGARY;
	}
	
	//��̬�ڲ��� �̰߳�ȫ Ч�ʸ�  
	public static class SingleInstance {
		private  static final SingleModelHungary INSTANCE = new SingleModelHungary();
	}
	
	public static SingleModelHungary getInstance3(){
		return SingleInstance.INSTANCE;
	}

}
