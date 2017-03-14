package com.netease.urs;

public class ntescode {
   static {
       System.loadLibrary("com_netease_urs_ntescode");
   }
   public byte[] cookie;
   public byte[] ssn;
   public byte[] p_uid;
   public byte[] mobile;
   public byte[] autologin;
   public long createTime = 0L;
   public long cookieCreateTime = 0L;
   public byte[] alias;
   public byte[] misc;
 
   public native int validate_cookie(byte[] buf,int p_id,long timeval,boolean flag);
   public native int validate_persistent_cookie(byte[] buf,int p_id,long timeval,boolean flag);
 
   public String toString(){
       String ret = "[cookie = " + new String(cookie) + "]"
                    + "[ssn = " + new String(ssn) + "]"
                    + "[ip = " + new String(p_uid) + "]"
                    + "[mobile = " + new String(mobile) + "]"
                    + "[createTime = " + String.valueOf(createTime) +"]"
                    + "[cookieCreateTime = " + String.valueOf(cookieCreateTime) +"]";
       if ( autologin != null )
            ret += "[autologin = " + new String(autologin) + "]"  ;
       if ( alias != null )
            ret += "[alias = " + new String(alias) + "]"  ;
       if ( misc != null )
            ret += "[misc = " + new String(misc) + "]"  ;
       return ret;
   }
}