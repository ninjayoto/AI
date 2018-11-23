﻿using System;
using EmailSkill;

namespace EmailSkillTest.Flow.Fakes
{
    public class MockMailServiceManager : IMailSkillServiceManager
    {
        public IMailService InitMailService(string token, TimeZoneInfo timeZoneInfo, MailSource mailSource)
        {
            return new MockMailService();
        }

        public IUserService InitUserService(string token, TimeZoneInfo timeZoneInfo, MailSource mailSource)
        {
            return new MockUserService();
        }
    }
}
