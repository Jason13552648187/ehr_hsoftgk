package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmGxml;
import cn.ibizlab.ehr.webapi.dto.PcmGxmlDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmGxmlMappingImpl implements PcmGxmlMapping {

    @Override
    public PcmGxml toDomain(PcmGxmlDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmGxml pcmGxml = new PcmGxml();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmGxml.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmGxml.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getNd() != null ) {
            pcmGxml.setNd( dto.getNd() );
        }
        if ( dto.getXh() != null ) {
            pcmGxml.setXh( dto.getXh() );
        }
        if ( dto.getXxxz() != null ) {
            pcmGxml.setXxxz( dto.getXxxz() );
        }
        if ( dto.getGxlb() != null ) {
            pcmGxml.setGxlb( dto.getGxlb() );
        }
        if ( dto.getNationarea() != null ) {
            pcmGxml.setNationarea( dto.getNationarea() );
        }
        if ( dto.getPcmgxmlname() != null ) {
            pcmGxml.setPcmgxmlname( dto.getPcmgxmlname() );
        }
        if ( dto.getPcmgxmlid() != null ) {
            pcmGxml.setPcmgxmlid( dto.getPcmgxmlid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmGxml.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmGxml.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmGxml.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmGxml.setCreatedate( dto.getCreatedate() );
        }

        return pcmGxml;
    }

    @Override
    public PcmGxmlDTO toDto(PcmGxml entity) {
        if ( entity == null ) {
            return null;
        }

        PcmGxmlDTO pcmGxmlDTO = new PcmGxmlDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmGxmlDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmGxmlDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getNd() != null ) {
            pcmGxmlDTO.setNd( entity.getNd() );
        }
        if ( entity.getXh() != null ) {
            pcmGxmlDTO.setXh( entity.getXh() );
        }
        if ( entity.getXxxz() != null ) {
            pcmGxmlDTO.setXxxz( entity.getXxxz() );
        }
        if ( entity.getGxlb() != null ) {
            pcmGxmlDTO.setGxlb( entity.getGxlb() );
        }
        if ( entity.getNationarea() != null ) {
            pcmGxmlDTO.setNationarea( entity.getNationarea() );
        }
        if ( entity.getPcmgxmlname() != null ) {
            pcmGxmlDTO.setPcmgxmlname( entity.getPcmgxmlname() );
        }
        if ( entity.getPcmgxmlid() != null ) {
            pcmGxmlDTO.setPcmgxmlid( entity.getPcmgxmlid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmGxmlDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmGxmlDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmGxmlDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmGxmlDTO.setCreatedate( entity.getCreatedate() );
        }

        return pcmGxmlDTO;
    }

    @Override
    public List<PcmGxml> toDomain(List<PcmGxmlDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmGxml> list = new ArrayList<PcmGxml>( dtoList.size() );
        for ( PcmGxmlDTO pcmGxmlDTO : dtoList ) {
            list.add( toDomain( pcmGxmlDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmGxmlDTO> toDto(List<PcmGxml> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmGxmlDTO> list = new ArrayList<PcmGxmlDTO>( entityList.size() );
        for ( PcmGxml pcmGxml : entityList ) {
            list.add( toDto( pcmGxml ) );
        }

        return list;
    }
}
