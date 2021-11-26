package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmXygzzkhjgjl;
import cn.ibizlab.ehr.webapi.dto.PcmXygzzkhjgjlDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmXygzzkhjgjlMappingImpl implements PcmXygzzkhjgjlMapping {

    @Override
    public PcmXygzzkhjgjl toDomain(PcmXygzzkhjgjlDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmXygzzkhjgjl pcmXygzzkhjgjl = new PcmXygzzkhjgjl();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmXygzzkhjgjl.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmXygzzkhjgjl.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJssj() != null ) {
            pcmXygzzkhjgjl.setJssj( dto.getJssj() );
        }
        if ( dto.getYgbh() != null ) {
            pcmXygzzkhjgjl.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPj() != null ) {
            pcmXygzzkhjgjl.setPj( dto.getPj() );
        }
        if ( dto.getPcmxygzzkhjgjlname() != null ) {
            pcmXygzzkhjgjl.setPcmxygzzkhjgjlname( dto.getPcmxygzzkhjgjlname() );
        }
        if ( dto.getEnable() != null ) {
            pcmXygzzkhjgjl.setEnable( dto.getEnable() );
        }
        if ( dto.getFs() != null ) {
            pcmXygzzkhjgjl.setFs( dto.getFs() );
        }
        if ( dto.getQssj() != null ) {
            pcmXygzzkhjgjl.setQssj( dto.getQssj() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmXygzzkhjgjl.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmxygzzkhjgjlid() != null ) {
            pcmXygzzkhjgjl.setPcmxygzzkhjgjlid( dto.getPcmxygzzkhjgjlid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmXygzzkhjgjl.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmXygzzkhjgjl.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmXygzzkhjgjl.setUpdatedate( dto.getUpdatedate() );
        }

        return pcmXygzzkhjgjl;
    }

    @Override
    public PcmXygzzkhjgjlDTO toDto(PcmXygzzkhjgjl entity) {
        if ( entity == null ) {
            return null;
        }

        PcmXygzzkhjgjlDTO pcmXygzzkhjgjlDTO = new PcmXygzzkhjgjlDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmXygzzkhjgjlDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmXygzzkhjgjlDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJssj() != null ) {
            pcmXygzzkhjgjlDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getYgbh() != null ) {
            pcmXygzzkhjgjlDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPj() != null ) {
            pcmXygzzkhjgjlDTO.setPj( entity.getPj() );
        }
        if ( entity.getPcmxygzzkhjgjlname() != null ) {
            pcmXygzzkhjgjlDTO.setPcmxygzzkhjgjlname( entity.getPcmxygzzkhjgjlname() );
        }
        if ( entity.getEnable() != null ) {
            pcmXygzzkhjgjlDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getFs() != null ) {
            pcmXygzzkhjgjlDTO.setFs( entity.getFs() );
        }
        if ( entity.getQssj() != null ) {
            pcmXygzzkhjgjlDTO.setQssj( entity.getQssj() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmXygzzkhjgjlDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmxygzzkhjgjlid() != null ) {
            pcmXygzzkhjgjlDTO.setPcmxygzzkhjgjlid( entity.getPcmxygzzkhjgjlid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmXygzzkhjgjlDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmXygzzkhjgjlDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmXygzzkhjgjlDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return pcmXygzzkhjgjlDTO;
    }

    @Override
    public List<PcmXygzzkhjgjl> toDomain(List<PcmXygzzkhjgjlDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmXygzzkhjgjl> list = new ArrayList<PcmXygzzkhjgjl>( dtoList.size() );
        for ( PcmXygzzkhjgjlDTO pcmXygzzkhjgjlDTO : dtoList ) {
            list.add( toDomain( pcmXygzzkhjgjlDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmXygzzkhjgjlDTO> toDto(List<PcmXygzzkhjgjl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmXygzzkhjgjlDTO> list = new ArrayList<PcmXygzzkhjgjlDTO>( entityList.size() );
        for ( PcmXygzzkhjgjl pcmXygzzkhjgjl : entityList ) {
            list.add( toDto( pcmXygzzkhjgjl ) );
        }

        return list;
    }
}
