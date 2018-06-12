package com.tencent.mm.accessibility;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ViewSearchTool
{
  private static final String GET_DEFAULT_IMPL = "getDefault";
  private static final String GET_GLOBAL_INSTANCE = "getInstance";
  private static final String TAG = "ViewSearchTool";
  private static final String VIEWS_FIELD = "mViews";
  private static final String WINDOW_MANAGER_GLOBAL_CLAZZ = "android.view.WindowManagerGlobal";
  private static final String WINDOW_MANAGER_IMPL_CLAZZ = "android.view.WindowManagerImpl";
  private static final String WINDOW_PARAMS_FIELD = "mParams";
  
  private List<View> filter(View paramView, Matcher paramMatcher)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(0, Collections.singletonList(paramView));
    int i = 0;
    Iterator localIterator;
    View localView;
    for (;;)
    {
      paramView = new ArrayList();
      localIterator = ((List)((List)localObject).get(i)).iterator();
      while (localIterator.hasNext())
      {
        localView = (View)localIterator.next();
        if ((localView instanceof ViewGroup))
        {
          int j = 0;
          while (j < ((ViewGroup)localView).getChildCount())
          {
            paramView.add(((ViewGroup)localView).getChildAt(j));
            j += 1;
          }
        }
      }
      if (paramView.isEmpty()) {
        break;
      }
      ((List)localObject).add(paramView);
      i += 1;
    }
    paramView = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      localIterator = ((List)((Iterator)localObject).next()).iterator();
      while (localIterator.hasNext())
      {
        localView = (View)localIterator.next();
        if (paramMatcher.match(localView)) {
          paramView.add(localView);
        }
      }
    }
    return paramView;
  }
  
  private List<View> findRoots()
  {
    Object localObject2;
    label22:
    Field localField;
    if (Build.VERSION.SDK_INT > 16)
    {
      localObject1 = "android.view.WindowManagerGlobal";
      if (Build.VERSION.SDK_INT <= 16) {
        break label115;
      }
      localObject2 = "getInstance";
      localObject1 = Class.forName((String)localObject1);
      localObject2 = ((Class)localObject1).getMethod((String)localObject2, new Class[0]).invoke(null, new Object[0]);
      localField = ((Class)localObject1).getDeclaredField("mViews");
      localField.setAccessible(true);
      ((Class)localObject1).getDeclaredField("mParams").setAccessible(true);
      if (Build.VERSION.SDK_INT >= 19) {
        break label121;
      }
    }
    label115:
    label121:
    for (Object localObject1 = Arrays.asList((View[])localField.get(localObject2));; localObject1 = (List)localField.get(localObject2))
    {
      if (((List)localObject1).size() != 0) {
        return localObject1;
      }
      throw new RuntimeException("something wrong");
      localObject1 = "android.view.WindowManagerImpl";
      break;
      localObject2 = "getDefault";
      break label22;
    }
    return (List<View>)localObject1;
  }
  
  @Deprecated
  public static String findText(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    Object localObject = paramView.getContentDescription();
    if (localObject == null)
    {
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int j = localViewGroup.getChildCount();
        int i = 0;
        for (paramView = (View)localObject;; paramView = (View)localObject)
        {
          localObject = paramView;
          if (i >= j) {
            break;
          }
          View localView = localViewGroup.getChildAt(i);
          localObject = paramView;
          if (localView != null) {
            if (!(localView instanceof ViewGroup))
            {
              localObject = paramView;
              if (!(localView instanceof TextView)) {}
            }
            else
            {
              paramView = findText(localView);
              localObject = paramView;
              if (paramView != null) {
                break;
              }
              localObject = paramView;
            }
          }
          i += 1;
        }
      }
      if ((paramView instanceof TextView)) {
        localObject = ((TextView)paramView).getText();
      }
      if (localObject != null) {
        return ((CharSequence)localObject).toString();
      }
    }
    else
    {
      return ((CharSequence)localObject).toString();
    }
    return null;
  }
  
  @Deprecated
  public static String findViewDepth(View paramView1, View paramView2, String paramString)
  {
    if ((paramView1 == null) || (paramView2 == null)) {
      paramView1 = null;
    }
    String str;
    do
    {
      return paramView1;
      str = paramString;
      if (paramString == null) {
        str = "";
      }
      if (!paramView1.equals(paramView2)) {
        break;
      }
      paramView1 = str;
    } while (!str.startsWith("_"));
    return str.substring(1);
    if ((paramView1 instanceof ViewGroup))
    {
      paramView1 = (ViewGroup)paramView1;
      int j = paramView1.getChildCount();
      int i = 0;
      while (i < j)
      {
        paramString = findViewDepth(paramView1.getChildAt(i), paramView2, str + "_" + i);
        if ((paramString != null) && (!paramString.equals("")))
        {
          paramView1 = paramString;
          if (paramString.startsWith("_")) {
            paramView1 = paramString.substring(1);
          }
          return paramView1;
        }
        i += 1;
      }
    }
    return null;
  }
  
  public List<View> findView(Matcher paramMatcher)
  {
    Iterator localIterator = findRoots().iterator();
    while (localIterator.hasNext())
    {
      List localList = filter((View)localIterator.next(), paramMatcher);
      if ((localList != null) && (localList.size() > 0)) {
        return localList;
      }
    }
    return null;
  }
  
  public static abstract interface Matcher
  {
    public abstract boolean match(View paramView);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/accessibility/ViewSearchTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */