package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmProfileNumBeprefix;
import cn.ibizlab.ehr.webapi.dto.PcmProfileNumBeprefixDTO;
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
public class PcmProfileNumBeprefixMappingImpl implements PcmProfileNumBeprefixMapping {

    @Override
    public PcmProfileNumBeprefix toDomain(PcmProfileNumBeprefixDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmProfileNumBeprefix pcmProfileNumBeprefix = new PcmProfileNumBeprefix();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmProfileNumBeprefix.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmProfileNumBeprefix.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getNumberprefix() != null ) {
            pcmProfileNumBeprefix.setNumberprefix( dto.getNumberprefix() );
        }
        if ( dto.getPcmprofilenumbeprefixname() != null ) {
            pcmProfileNumBeprefix.setPcmprofilenumbeprefixname( dto.getPcmprofilenumbeprefixname() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmProfileNumBeprefix.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmProfileNumBeprefix.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmProfileNumBeprefix.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmprofilenumbeprefixid() != null ) {
            pcmProfileNumBeprefix.setPcmprofilenumbeprefixid( dto.getPcmprofilenumbeprefixid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmProfileNumBeprefix.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmProfileNumBeprefix.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmProfileNumBeprefix.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmProfileNumBeprefix.setZzdzs( dto.getZzdzs() );
        }

        return pcmProfileNumBeprefix;
    }

    @Override
    public PcmProfileNumBeprefixDTO toDto(PcmProfileNumBeprefix entity) {
        if ( entity == null ) {
            return null;
        }

        PcmProfileNumBeprefixDTO pcmProfileNumBeprefixDTO = new PcmProfileNumBeprefixDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmProfileNumBeprefixDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmProfileNumBeprefixDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getNumberprefix() != null ) {
            pcmProfileNumBeprefixDTO.setNumberprefix( entity.getNumberprefix() );
        }
        if ( entity.getPcmprofilenumbeprefixname() != null ) {
            pcmProfileNumBeprefixDTO.setPcmprofilenumbeprefixname( entity.getPcmprofilenumbeprefixname() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmProfileNumBeprefixDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmProfileNumBeprefixDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmProfileNumBeprefixDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmprofilenumbeprefixid() != null ) {
            pcmProfileNumBeprefixDTO.setPcmprofilenumbeprefixid( entity.getPcmprofilenumbeprefixid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmProfileNumBeprefixDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmProfileNumBeprefixDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmProfileNumBeprefixDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmProfileNumBeprefixDTO.setZzdzs( entity.getZzdzs() );
        }

        return pcmProfileNumBeprefixDTO;
    }

    @Override
    public List<PcmProfileNumBeprefix> toDomain(List<PcmProfileNumBeprefixDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmProfileNumBeprefix> list = new ArrayList<PcmProfileNumBeprefix>( dtoList.size() );
        for ( PcmProfileNumBeprefixDTO pcmProfileNumBeprefixDTO : dtoList ) {
            list.add( toDomain( pcmProfileNumBeprefixDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmProfileNumBeprefixDTO> toDto(List<PcmProfileNumBeprefix> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmProfileNumBeprefixDTO> list = new ArrayList<PcmProfileNumBeprefixDTO>( entityList.size() );
        for ( PcmProfileNumBeprefix pcmProfileNumBeprefix : entityList ) {
            list.add( toDto( pcmProfileNumBeprefix ) );
        }

        return list;
    }
}
