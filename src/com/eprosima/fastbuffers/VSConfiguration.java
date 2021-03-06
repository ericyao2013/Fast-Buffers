/*************************************************************************
 * Copyright (c) 2013 eProsima. All rights reserved.
 *
 * This copy of FastBuffers is licensed to you under the terms described in the
 * FAST_BUFFERS_LICENSE file included in this distribution.
 *
 *************************************************************************/

package com.eprosima.fastbuffers;

public class VSConfiguration {
    
    private String name;
    private String platform;
    private boolean debug;
    private boolean dll;
    
    public VSConfiguration(){
        name = null;
        platform = null;
        debug = false;
        dll = false;        
    }

    public VSConfiguration(String name, String platform, boolean debug, boolean dll){
        this.name = name;
        this.platform = platform;
        this.debug = debug;
        this.dll = dll;     
    }
    
    public String getName(){
        return name;
    }
    
    public String getPlatform()
    {
        return platform;
    }
    
    public void setPlatform(String platform)
    {
        this.platform = platform;
    }

    public boolean isDll()
    {
        return dll;     
    }
    
    public boolean isDebug()
    {
        return debug;       
    }
    
    public boolean isRelease()
    {
        return !debug;      
    }
}

