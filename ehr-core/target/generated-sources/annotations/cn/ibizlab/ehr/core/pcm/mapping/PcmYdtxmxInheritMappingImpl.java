package cn.ibizlab.ehr.core.pcm.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdmx;
import cn.ibizlab.ehr.core.pcm.domain.PcmYdtxmx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-18T11:09:13+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdtxmxInheritMappingImpl implements PcmYdtxmxInheritMapping {

    @Override
    public PcmYdmx toPcmydmx(PcmYdtxmx pcmydtxmx) {
        if ( pcmydtxmx == null ) {
            return null;
        }

        PcmYdmx pcmYdmx = new PcmYdmx();

        pcmYdmx.setPcmydmxid( pcmydtxmx.getPcmydtxmxid() );
        pcmYdmx.setPcmydmxname( pcmydtxmx.getPcmydtxmxname() );
        Map<String, Object> map = pcmydtxmx.getExtensionparams();
        if ( map != null ) {
            pcmYdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdmx.setFinished( pcmydtxmx.getFinished() );
        pcmYdmx.setYzw( pcmydtxmx.getYzw() );
        pcmYdmx.setPcmydmxtype( pcmydtxmx.getPcmydmxtype() );
        pcmYdmx.setYrank( pcmydtxmx.getYrank() );
        pcmYdmx.setSxrq( pcmydtxmx.getSxrq() );
        pcmYdmx.setCheckstatus( pcmydtxmx.getCheckstatus() );
        pcmYdmx.setYgw( pcmydtxmx.getYgw() );
        pcmYdmx.setYgbh( pcmydtxmx.getYgbh() );
        pcmYdmx.setZjhm( pcmydtxmx.getZjhm() );
        pcmYdmx.setZz( pcmydtxmx.getZz() );
        pcmYdmx.setCsrq( pcmydtxmx.getCsrq() );
        pcmYdmx.setLxdh( pcmydtxmx.getLxdh() );
        pcmYdmx.setNl( pcmydtxmx.getNl() );
        pcmYdmx.setBm( pcmydtxmx.getBm() );
        pcmYdmx.setPimpersonid( pcmydtxmx.getPimpersonid() );
        pcmYdmx.setZzid( pcmydtxmx.getZzid() );
        pcmYdmx.setBmid( pcmydtxmx.getBmid() );
        pcmYdmx.setCreatedate( pcmydtxmx.getCreatedate() );
        pcmYdmx.setCreateman( pcmydtxmx.getCreateman() );
        pcmYdmx.setUpdatedate( pcmydtxmx.getUpdatedate() );
        pcmYdmx.setUpdateman( pcmydtxmx.getUpdateman() );
        pcmYdmx.setPimpersonname( pcmydtxmx.getPimpersonname() );
        pcmYdmx.setZzdzs( pcmydtxmx.getZzdzs() );
        pcmYdmx.setShortname( pcmydtxmx.getShortname() );

        return pcmYdmx;
    }

    @Override
    public PcmYdtxmx toPcmydtxmx(PcmYdmx pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        PcmYdtxmx pcmYdtxmx = new PcmYdtxmx();

        pcmYdtxmx.setPcmydtxmxid( pcmydmx.getPcmydmxid() );
        pcmYdtxmx.setPcmydtxmxname( pcmydmx.getPcmydmxname() );
        Map<String, Object> map = pcmydmx.getExtensionparams();
        if ( map != null ) {
            pcmYdtxmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdtxmx.setShortname( pcmydmx.getShortname() );
        pcmYdtxmx.setYzw( pcmydmx.getYzw() );
        pcmYdtxmx.setUpdateman( pcmydmx.getUpdateman() );
        pcmYdtxmx.setCreateman( pcmydmx.getCreateman() );
        pcmYdtxmx.setPimpersonname( pcmydmx.getPimpersonname() );
        pcmYdtxmx.setYgbh( pcmydmx.getYgbh() );
        pcmYdtxmx.setZzdzs( pcmydmx.getZzdzs() );
        pcmYdtxmx.setFinished( pcmydmx.getFinished() );
        pcmYdtxmx.setLxdh( pcmydmx.getLxdh() );
        pcmYdtxmx.setUpdatedate( pcmydmx.getUpdatedate() );
        pcmYdtxmx.setPcmydmxtype( pcmydmx.getPcmydmxtype() );
        pcmYdtxmx.setYrank( pcmydmx.getYrank() );
        pcmYdtxmx.setSxrq( pcmydmx.getSxrq() );
        pcmYdtxmx.setBmid( pcmydmx.getBmid() );
        pcmYdtxmx.setCheckstatus( pcmydmx.getCheckstatus() );
        pcmYdtxmx.setZjhm( pcmydmx.getZjhm() );
        pcmYdtxmx.setCreatedate( pcmydmx.getCreatedate() );
        pcmYdtxmx.setYgw( pcmydmx.getYgw() );
        pcmYdtxmx.setPimpersonid( pcmydmx.getPimpersonid() );
        pcmYdtxmx.setBm( pcmydmx.getBm() );
        pcmYdtxmx.setCsrq( pcmydmx.getCsrq() );
        pcmYdtxmx.setZzid( pcmydmx.getZzid() );
        pcmYdtxmx.setNl( pcmydmx.getNl() );
        pcmYdtxmx.setZz( pcmydmx.getZz() );

        return pcmYdtxmx;
    }

    @Override
    public List<PcmYdmx> toPcmydmx(List<PcmYdtxmx> pcmydtxmx) {
        if ( pcmydtxmx == null ) {
            return null;
        }

        List<PcmYdmx> list = new ArrayList<PcmYdmx>( pcmydtxmx.size() );
        for ( PcmYdtxmx pcmYdtxmx : pcmydtxmx ) {
            list.add( toPcmydmx( pcmYdtxmx ) );
        }

        return list;
    }

    @Override
    public List<PcmYdtxmx> toPcmydtxmx(List<PcmYdmx> pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        List<PcmYdtxmx> list = new ArrayList<PcmYdtxmx>( pcmydmx.size() );
        for ( PcmYdmx pcmYdmx : pcmydmx ) {
            list.add( toPcmydtxmx( pcmYdmx ) );
        }

        return list;
    }
}
