package com.xu.single;

/**
 * ����ģʽ
 * ��֤��ǰ����ȫ��ֻ��һ��ʵ��
 * ����ģʽ
 * @author xurw
 *
 */
public class SingleModelFull {
	
	private static SingleModelFull singleModel = null;
	
	private SingleModelFull(){
		
	}
	
	//д��1:��д���̲߳���ȫ
	public static SingleModelFull getInstance1(){
		if (null == singleModel) {
			singleModel = new SingleModelFull();
		}
		return singleModel;
	}
	//д��2:ʹ��synchronized�ؼ��� �����߳�ͬ�� �̰߳�ȫ  Ч�ʵ�
	public static synchronized SingleModelFull getInstance2(){
		if (null == singleModel) {
			singleModel = new SingleModelFull();
		}
		return singleModel;
	}
	
	//д��3:ʹ��ͬ������� ��д��2Ч�ʸ�  ���Ƕ��߳������ �̲߳���ȫ ���״������ʵ��
	public static SingleModelFull getInstance3(){
		if (null == singleModel) {
			synchronized (SingleModelFull.class) {
				singleModel = new SingleModelFull();
			}
		}
		return singleModel;
	}
	
	//д��4:˫�ؼ�� �̰߳�ȫ
	public static SingleModelFull getInstance4(){
		if (null == singleModel) {
			synchronized (SingleModelFull.class){
				if (null == singleModel) {
					singleModel = new SingleModelFull();
				}
			}
		}
		return singleModel;
	}
}
