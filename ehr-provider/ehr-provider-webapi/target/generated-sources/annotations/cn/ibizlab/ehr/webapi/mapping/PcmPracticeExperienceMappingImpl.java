package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmPracticeExperience;
import cn.ibizlab.ehr.webapi.dto.PcmPracticeExperienceDTO;
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
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmPracticeExperienceMappingImpl implements PcmPracticeExperienceMapping {

    @Override
    public PcmPracticeExperience toDomain(PcmPracticeExperienceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmPracticeExperience pcmPracticeExperience = new PcmPracticeExperience();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmPracticeExperience.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmPracticeExperience.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPracticereferencesposition() != null ) {
            pcmPracticeExperience.setPracticereferencesposition( dto.getPracticereferencesposition() );
        }
        if ( dto.getPracticecompanydescription() != null ) {
            pcmPracticeExperience.setPracticecompanydescription( dto.getPracticecompanydescription() );
        }
        if ( dto.getEndtime() != null ) {
            pcmPracticeExperience.setEndtime( dto.getEndtime() );
        }
        if ( dto.getPracticecompanyname() != null ) {
            pcmPracticeExperience.setPracticecompanyname( dto.getPracticecompanyname() );
        }
        if ( dto.getFlag() != null ) {
            pcmPracticeExperience.setFlag( dto.getFlag() );
        }
        if ( dto.getBbsj() != null ) {
            pcmPracticeExperience.setBbsj( dto.getBbsj() );
        }
        if ( dto.getPracticecontent() != null ) {
            pcmPracticeExperience.setPracticecontent( dto.getPracticecontent() );
        }
        if ( dto.getPracticereferencesname() != null ) {
            pcmPracticeExperience.setPracticereferencesname( dto.getPracticereferencesname() );
        }
        if ( dto.getPracticereferencescontact() != null ) {
            pcmPracticeExperience.setPracticereferencescontact( dto.getPracticereferencescontact() );
        }
        if ( dto.getSxpj() != null ) {
            pcmPracticeExperience.setSxpj( dto.getSxpj() );
        }
        if ( dto.getPcmpracticeexperiencename() != null ) {
            pcmPracticeExperience.setPcmpracticeexperiencename( dto.getPcmpracticeexperiencename() );
        }
        if ( dto.getPracticeaddress() != null ) {
            pcmPracticeExperience.setPracticeaddress( dto.getPracticeaddress() );
        }
        if ( dto.getSxgw() != null ) {
            pcmPracticeExperience.setSxgw( dto.getSxgw() );
        }
        if ( dto.getPracticereferencesrelation() != null ) {
            pcmPracticeExperience.setPracticereferencesrelation( dto.getPracticereferencesrelation() );
        }
        if ( dto.getStarttime() != null ) {
            pcmPracticeExperience.setStarttime( dto.getStarttime() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmPracticeExperience.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmPracticeExperience.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmPracticeExperience.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmPracticeExperience.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmPracticeExperience.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmpracticeexperienceid() != null ) {
            pcmPracticeExperience.setPcmpracticeexperienceid( dto.getPcmpracticeexperienceid() );
        }
        if ( dto.getPcmprofilename() != null ) {
            pcmPracticeExperience.setPcmprofilename( dto.getPcmprofilename() );
        }
        if ( dto.getCertificatenumber() != null ) {
            pcmPracticeExperience.setCertificatenumber( dto.getCertificatenumber() );
        }

        return pcmPracticeExperience;
    }

    @Override
    public PcmPracticeExperienceDTO toDto(PcmPracticeExperience entity) {
        if ( entity == null ) {
            return null;
        }

        PcmPracticeExperienceDTO pcmPracticeExperienceDTO = new PcmPracticeExperienceDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmPracticeExperienceDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmPracticeExperienceDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPracticereferencesposition() != null ) {
            pcmPracticeExperienceDTO.setPracticereferencesposition( entity.getPracticereferencesposition() );
        }
        if ( entity.getPracticecompanydescription() != null ) {
            pcmPracticeExperienceDTO.setPracticecompanydescription( entity.getPracticecompanydescription() );
        }
        if ( entity.getEndtime() != null ) {
            pcmPracticeExperienceDTO.setEndtime( entity.getEndtime() );
        }
        if ( entity.getPracticecompanyname() != null ) {
            pcmPracticeExperienceDTO.setPracticecompanyname( entity.getPracticecompanyname() );
        }
        if ( entity.getFlag() != null ) {
            pcmPracticeExperienceDTO.setFlag( entity.getFlag() );
        }
        if ( entity.getBbsj() != null ) {
            pcmPracticeExperienceDTO.setBbsj( entity.getBbsj() );
        }
        if ( entity.getPracticecontent() != null ) {
            pcmPracticeExperienceDTO.setPracticecontent( entity.getPracticecontent() );
        }
        if ( entity.getPracticereferencesname() != null ) {
            pcmPracticeExperienceDTO.setPracticereferencesname( entity.getPracticereferencesname() );
        }
        if ( entity.getPracticereferencescontact() != null ) {
            pcmPracticeExperienceDTO.setPracticereferencescontact( entity.getPracticereferencescontact() );
        }
        if ( entity.getSxpj() != null ) {
            pcmPracticeExperienceDTO.setSxpj( entity.getSxpj() );
        }
        if ( entity.getPcmpracticeexperiencename() != null ) {
            pcmPracticeExperienceDTO.setPcmpracticeexperiencename( entity.getPcmpracticeexperiencename() );
        }
        if ( entity.getPracticeaddress() != null ) {
            pcmPracticeExperienceDTO.setPracticeaddress( entity.getPracticeaddress() );
        }
        if ( entity.getSxgw() != null ) {
            pcmPracticeExperienceDTO.setSxgw( entity.getSxgw() );
        }
        if ( entity.getPracticereferencesrelation() != null ) {
            pcmPracticeExperienceDTO.setPracticereferencesrelation( entity.getPracticereferencesrelation() );
        }
        if ( entity.getStarttime() != null ) {
            pcmPracticeExperienceDTO.setStarttime( entity.getStarttime() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmPracticeExperienceDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmPracticeExperienceDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmPracticeExperienceDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmPracticeExperienceDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmPracticeExperienceDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmpracticeexperienceid() != null ) {
            pcmPracticeExperienceDTO.setPcmpracticeexperienceid( entity.getPcmpracticeexperienceid() );
        }
        if ( entity.getPcmprofilename() != null ) {
            pcmPracticeExperienceDTO.setPcmprofilename( entity.getPcmprofilename() );
        }
        if ( entity.getCertificatenumber() != null ) {
            pcmPracticeExperienceDTO.setCertificatenumber( entity.getCertificatenumber() );
        }

        return pcmPracticeExperienceDTO;
    }

    @Override
    public List<PcmPracticeExperience> toDomain(List<PcmPracticeExperienceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmPracticeExperience> list = new ArrayList<PcmPracticeExperience>( dtoList.size() );
        for ( PcmPracticeExperienceDTO pcmPracticeExperienceDTO : dtoList ) {
            list.add( toDomain( pcmPracticeExperienceDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmPracticeExperienceDTO> toDto(List<PcmPracticeExperience> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmPracticeExperienceDTO> list = new ArrayList<PcmPracticeExperienceDTO>( entityList.size() );
        for ( PcmPracticeExperience pcmPracticeExperience : entityList ) {
            list.add( toDto( pcmPracticeExperience ) );
        }

        return list;
    }
}
