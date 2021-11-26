package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmXygzzsqmx;
import cn.ibizlab.ehr.webapi.dto.PcmXygzzsqmxDTO;
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
    date = "2021-09-04T00:31:44+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmXygzzsqmxMappingImpl implements PcmXygzzsqmxMapping {

    @Override
    public PcmXygzzsqmx toDomain(PcmXygzzsqmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmXygzzsqmx pcmXygzzsqmx = new PcmXygzzsqmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmXygzzsqmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmXygzzsqmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFinished() != null ) {
            pcmXygzzsqmx.setFinished( dto.getFinished() );
        }
        if ( dto.getEnable() != null ) {
            pcmXygzzsqmx.setEnable( dto.getEnable() );
        }
        if ( dto.getPcmxygzzsqmxname() != null ) {
            pcmXygzzsqmx.setPcmxygzzsqmxname( dto.getPcmxygzzsqmxname() );
        }
        if ( dto.getBm() != null ) {
            pcmXygzzsqmx.setBm( dto.getBm() );
        }
        if ( dto.getGw() != null ) {
            pcmXygzzsqmx.setGw( dto.getGw() );
        }
        if ( dto.getZj() != null ) {
            pcmXygzzsqmx.setZj( dto.getZj() );
        }
        if ( dto.getZz() != null ) {
            pcmXygzzsqmx.setZz( dto.getZz() );
        }
        if ( dto.getZw() != null ) {
            pcmXygzzsqmx.setZw( dto.getZw() );
        }
        if ( dto.getPcmxygzzsqid() != null ) {
            pcmXygzzsqmx.setPcmxygzzsqid( dto.getPcmxygzzsqid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmXygzzsqmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmXygzzsqmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmXygzzsqmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmXygzzsqmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmXygzzsqmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPcmxygzzsqmxid() != null ) {
            pcmXygzzsqmx.setPcmxygzzsqmxid( dto.getPcmxygzzsqmxid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmXygzzsqmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getPcmxygzzsqname() != null ) {
            pcmXygzzsqmx.setPcmxygzzsqname( dto.getPcmxygzzsqname() );
        }

        return pcmXygzzsqmx;
    }

    @Override
    public PcmXygzzsqmxDTO toDto(PcmXygzzsqmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmXygzzsqmxDTO pcmXygzzsqmxDTO = new PcmXygzzsqmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmXygzzsqmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmXygzzsqmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFinished() != null ) {
            pcmXygzzsqmxDTO.setFinished( entity.getFinished() );
        }
        if ( entity.getEnable() != null ) {
            pcmXygzzsqmxDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getPcmxygzzsqmxname() != null ) {
            pcmXygzzsqmxDTO.setPcmxygzzsqmxname( entity.getPcmxygzzsqmxname() );
        }
        if ( entity.getBm() != null ) {
            pcmXygzzsqmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getGw() != null ) {
            pcmXygzzsqmxDTO.setGw( entity.getGw() );
        }
        if ( entity.getZj() != null ) {
            pcmXygzzsqmxDTO.setZj( entity.getZj() );
        }
        if ( entity.getZz() != null ) {
            pcmXygzzsqmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getZw() != null ) {
            pcmXygzzsqmxDTO.setZw( entity.getZw() );
        }
        if ( entity.getPcmxygzzsqid() != null ) {
            pcmXygzzsqmxDTO.setPcmxygzzsqid( entity.getPcmxygzzsqid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmXygzzsqmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmXygzzsqmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmXygzzsqmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmXygzzsqmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmXygzzsqmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPcmxygzzsqmxid() != null ) {
            pcmXygzzsqmxDTO.setPcmxygzzsqmxid( entity.getPcmxygzzsqmxid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmXygzzsqmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getPcmxygzzsqname() != null ) {
            pcmXygzzsqmxDTO.setPcmxygzzsqname( entity.getPcmxygzzsqname() );
        }

        return pcmXygzzsqmxDTO;
    }

    @Override
    public List<PcmXygzzsqmx> toDomain(List<PcmXygzzsqmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmXygzzsqmx> list = new ArrayList<PcmXygzzsqmx>( dtoList.size() );
        for ( PcmXygzzsqmxDTO pcmXygzzsqmxDTO : dtoList ) {
            list.add( toDomain( pcmXygzzsqmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmXygzzsqmxDTO> toDto(List<PcmXygzzsqmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmXygzzsqmxDTO> list = new ArrayList<PcmXygzzsqmxDTO>( entityList.size() );
        for ( PcmXygzzsqmx pcmXygzzsqmx : entityList ) {
            list.add( toDto( pcmXygzzsqmx ) );
        }

        return list;
    }
}
