package io.rattengineer.jsontest;

import com.google.gson.Gson;

import io.rattengineer.jsontest.object.Human;

/**
 * 
 * Json 직렬화 및 역직렬화와 관련한 간단한 예제입니다.
 * Json 직렬화 및 역직렬화를 하려면 다음 dependency를 Insert 하시기 바랍니다.<br>
 * <pre>
 * &lt;dependencies>
&lt;!-- https://mvnrepository.com/artifact/com.google.code.gson/gson --&gt;
	&lt;dependency>
    	&lt;groupId>com.google.code.gson&lt;/groupId&gt;
    	&lt;artifactId>gson&lt;/artifactId&gt;
    	&lt;version>2.7&lt;/version&gt;
	&lt;/dependency&gt;
&lt;/dependencies&gt;
 * </pre>
 * @author Junwon Kim
 *
 */
public class JsonTest
{
	public static void main(String[] args)
	{
		// 직렬화
		Gson gson = new Gson();
		Human human = new Human(12, 167.53D, 60.05D);
		human.setName("Gil Dong Hong");
		String result = gson.toJson(human);
		// 출력값 : {"age":12,"height":167.53,"weight":60.05,"name":"Gil Dong Hong"}
		System.out.println(result);
		
		// 역직렬화
		Human human2 = gson.fromJson(result, Human.class);
		
		// 출력값 : Gil Dong Hong
		System.out.println(human2.name);
	}
}
