package utils.seven;

import java.util.*;

public class Hancock {
//	public void addStrings(List list) {
//  public void addStrings(List<String> list) {
  public void addStrings(List<? super String> list) {
//  public void addStrings(List<? extends String> list) {
		list.add("foo");
	}
}