package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdmx;
import cn.ibizlab.ehr.webapi.dto.PcmYdmxDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdmxMappingImpl implements PcmYdmxMapping {

    @Override
    public PcmYdmx toDomain(PcmYdmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmYdmx pcmYdmx = new PcmYdmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmYdmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmYdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFinished() != null ) {
            pcmYdmx.setFinished( dto.getFinished() );
        }
        if ( dto.getPcmydmxname() != null ) {
            pcmYdmx.setPcmydmxname( dto.getPcmydmxname() );
        }
        if ( dto.getYzw() != null ) {
            pcmYdmx.setYzw( dto.getYzw() );
        }
        if ( dto.getPcmydmxtype() != null ) {
            pcmYdmx.setPcmydmxtype( dto.getPcmydmxtype() );
        }
        if ( dto.getYrank() != null ) {
            pcmYdmx.setYrank( dto.getYrank() );
        }
        if ( dto.getSxrq() != null ) {
            pcmYdmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmYdmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getYgw() != null ) {
            pcmYdmx.setYgw( dto.getYgw() );
        }
        if ( dto.getYgbh() != null ) {
            pcmYdmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getZjhm() != null ) {
            pcmYdmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getZz() != null ) {
            pcmYdmx.setZz( dto.getZz() );
        }
        if ( dto.getCsrq() != null ) {
            pcmYdmx.setCsrq( dto.getCsrq() );
        }
        if ( dto.getLxdh() != null ) {
            pcmYdmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getNl() != null ) {
            pcmYdmx.setNl( dto.getNl() );
        }
        if ( dto.getBm() != null ) {
            pcmYdmx.setBm( dto.getBm() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmYdmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getZzid() != null ) {
            pcmYdmx.setZzid( dto.getZzid() );
        }
        if ( dto.getBmid() != null ) {
            pcmYdmx.setBmid( dto.getBmid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmYdmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmYdmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmYdmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPcmydmxid() != null ) {
            pcmYdmx.setPcmydmxid( dto.getPcmydmxid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmYdmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmYdmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmYdmx.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getShortname() != null ) {
            pcmYdmx.setShortname( dto.getShortname() );
        }

        return pcmYdmx;
    }

    @Override
    public PcmYdmxDTO toDto(PcmYdmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmYdmxDTO pcmYdmxDTO = new PcmYdmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmYdmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmYdmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFinished() != null ) {
            pcmYdmxDTO.setFinished( entity.getFinished() );
        }
        if ( entity.getPcmydmxname() != null ) {
            pcmYdmxDTO.setPcmydmxname( entity.getPcmydmxname() );
        }
        if ( entity.getYzw() != null ) {
            pcmYdmxDTO.setYzw( entity.getYzw() );
        }
        if ( entity.getPcmydmxtype() != null ) {
            pcmYdmxDTO.setPcmydmxtype( entity.getPcmydmxtype() );
        }
        if ( entity.getYrank() != null ) {
            pcmYdmxDTO.setYrank( entity.getYrank() );
        }
        if ( entity.getSxrq() != null ) {
            pcmYdmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmYdmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getYgw() != null ) {
            pcmYdmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getYgbh() != null ) {
            pcmYdmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getZjhm() != null ) {
            pcmYdmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getZz() != null ) {
            pcmYdmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getCsrq() != null ) {
            pcmYdmxDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getLxdh() != null ) {
            pcmYdmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getNl() != null ) {
            pcmYdmxDTO.setNl( entity.getNl() );
        }
        if ( entity.getBm() != null ) {
            pcmYdmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmYdmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getZzid() != null ) {
            pcmYdmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getBmid() != null ) {
            pcmYdmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmYdmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmYdmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmYdmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPcmydmxid() != null ) {
            pcmYdmxDTO.setPcmydmxid( entity.getPcmydmxid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmYdmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmYdmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmYdmxDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getShortname() != null ) {
            pcmYdmxDTO.setShortname( entity.getShortname() );
        }

        return pcmYdmxDTO;
    }

    @Override
    public List<PcmYdmx> toDomain(List<PcmYdmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmYdmx> list = new ArrayList<PcmYdmx>( dtoList.size() );
        for ( PcmYdmxDTO pcmYdmxDTO : dtoList ) {
            list.add( toDomain( pcmYdmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmYdmxDTO> toDto(List<PcmYdmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmYdmxDTO> list = new ArrayList<PcmYdmxDTO>( entityList.size() );
        for ( PcmYdmx pcmYdmx : entityList ) {
            list.add( toDto( pcmYdmx ) );
        }

        return list;
    }
}
