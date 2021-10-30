//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.core.vo.beans;

public class PersonNameListVoBean extends ims.vo.ValueObjectBean
{
	public PersonNameListVoBean()
	{
	}
	public PersonNameListVoBean(ims.core.vo.PersonNameListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.surname = vo.getSurname();
		this.forename = vo.getForename();
		this.title = vo.getTitle() == null ? null : (ims.vo.LookupInstanceBean)vo.getTitle().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.PersonNameListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.surname = vo.getSurname();
		this.forename = vo.getForename();
		this.title = vo.getTitle() == null ? null : (ims.vo.LookupInstanceBean)vo.getTitle().getBean();
	}

	public ims.core.vo.PersonNameListVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.PersonNameListVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.PersonNameListVo vo = null;
		if(map != null)
			vo = (ims.core.vo.PersonNameListVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.PersonNameListVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public void setSurname(String value)
	{
		this.surname = value;
	}
	public String getForename()
	{
		return this.forename;
	}
	public void setForename(String value)
	{
		this.forename = value;
	}
	public ims.vo.LookupInstanceBean getTitle()
	{
		return this.title;
	}
	public void setTitle(ims.vo.LookupInstanceBean value)
	{
		this.title = value;
	}

	private Integer id;
	private int version;
	private String surname;
	private String forename;
	private ims.vo.LookupInstanceBean title;
}
