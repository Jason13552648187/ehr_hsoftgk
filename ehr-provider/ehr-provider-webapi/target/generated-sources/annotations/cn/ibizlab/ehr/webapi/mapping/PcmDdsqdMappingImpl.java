package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmDdsqd;
import cn.ibizlab.ehr.webapi.dto.PcmDdsqdDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmDdsqdMappingImpl implements PcmDdsqdMapping {

    @Override
    public PcmDdsqd toDomain(PcmDdsqdDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmDdsqd pcmDdsqd = new PcmDdsqd();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmDdsqd.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmDdsqd.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSqsj() != null ) {
            pcmDdsqd.setSqsj( dto.getSqsj() );
        }
        if ( dto.getBzsm() != null ) {
            pcmDdsqd.setBzsm( dto.getBzsm() );
        }
        if ( dto.getPcmddsqdname() != null ) {
            pcmDdsqd.setPcmddsqdname( dto.getPcmddsqdname() );
        }
        if ( dto.getLx() != null ) {
            pcmDdsqd.setLx( dto.getLx() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmDdsqd.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmDdsqd.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmddsqdid() != null ) {
            pcmDdsqd.setPcmddsqdid( dto.getPcmddsqdid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmDdsqd.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmDdsqd.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmDdsqd.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgid() != null ) {
            pcmDdsqd.setOrgid( dto.getOrgid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmDdsqd.setPimpersonname( dto.getPimpersonname() );
        }

        return pcmDdsqd;
    }

    @Override
    public PcmDdsqdDTO toDto(PcmDdsqd entity) {
        if ( entity == null ) {
            return null;
        }

        PcmDdsqdDTO pcmDdsqdDTO = new PcmDdsqdDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmDdsqdDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmDdsqdDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSqsj() != null ) {
            pcmDdsqdDTO.setSqsj( entity.getSqsj() );
        }
        if ( entity.getBzsm() != null ) {
            pcmDdsqdDTO.setBzsm( entity.getBzsm() );
        }
        if ( entity.getPcmddsqdname() != null ) {
            pcmDdsqdDTO.setPcmddsqdname( entity.getPcmddsqdname() );
        }
        if ( entity.getLx() != null ) {
            pcmDdsqdDTO.setLx( entity.getLx() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmDdsqdDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmDdsqdDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmddsqdid() != null ) {
            pcmDdsqdDTO.setPcmddsqdid( entity.getPcmddsqdid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmDdsqdDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmDdsqdDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmDdsqdDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgid() != null ) {
            pcmDdsqdDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmDdsqdDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pcmDdsqdDTO;
    }

    @Override
    public List<PcmDdsqd> toDomain(List<PcmDdsqdDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmDdsqd> list = new ArrayList<PcmDdsqd>( dtoList.size() );
        for ( PcmDdsqdDTO pcmDdsqdDTO : dtoList ) {
            list.add( toDomain( pcmDdsqdDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmDdsqdDTO> toDto(List<PcmDdsqd> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmDdsqdDTO> list = new ArrayList<PcmDdsqdDTO>( entityList.size() );
        for ( PcmDdsqd pcmDdsqd : entityList ) {
            list.add( toDto( pcmDdsqd ) );
        }

        return list;
    }
}
