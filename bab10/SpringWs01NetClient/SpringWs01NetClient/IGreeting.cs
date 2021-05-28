using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SpringWs01NetClient
{
    interface IGreeting
    {
        int getGuestId();
        void setGuestId(int guestId);
        String getGuestName();
        void setGuestName(String guestName);
        String getMessage();
        void setMessage(String message);
    }
}
