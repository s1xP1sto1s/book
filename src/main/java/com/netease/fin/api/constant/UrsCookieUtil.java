package com.netease.fin.api.constant;

public class UrsCookieUtil {
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

	public native int validate_cookie(byte[] buf, int p_id, long timeval, boolean flag);

	public native int validate_persistent_cookie(byte[] buf, int p_id, long timeval, boolean flag);

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[cookie = ").append(new String(cookie)).append("]")
				.append("[ssn = ").append(new String(ssn)).append("]")
				.append("[ip = ").append(new String(p_uid)).append("]")
				.append("[mobile = ").append(new String(mobile)).append("]")
				.append("[createTime = ").append(String.valueOf(createTime)).append("]")
				.append("[cookieCreateTime = ").append(String.valueOf(cookieCreateTime)).append("]");
		if (autologin != null)
			builder.append("[autologin = ").append(new String(autologin)).append("]");
		if (alias != null)
			builder.append("[alias = ").append(new String(alias)).append("]");
		if (misc != null)
			builder.append("[misc = ").append(new String(misc)).append("]");
		return builder.toString();
	}
}
